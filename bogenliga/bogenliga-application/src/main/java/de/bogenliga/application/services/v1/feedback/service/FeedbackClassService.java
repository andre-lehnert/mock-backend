package de.bogenliga.application.services.v1.feedback.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import de.bogenliga.application.business.user.api.UserRoleComponent;
import de.bogenliga.application.common.service.ServiceFacade;
import de.bogenliga.application.springconfiguration.security.permissions.RequiresPermission;
import de.bogenliga.application.springconfiguration.security.types.UserPermission;


/**
 * I'm a REST resource and handle liga CRUD requests over the HTTP protocol
 *
 * @author Lars Bahnmüller, Lars_Herbert.Bahnmueller@Student.Reutlingen-University.DE
 */
@RestController
@CrossOrigin
@RequestMapping("v1/feedback")
public class FeedbackClassService implements ServiceFacade {

    private final UserRoleComponent userRoleComponent;
    private static final Logger LOGGER = LoggerFactory.getLogger(FeedbackClassService.class);

    /**
     * Create a intance of UserRoleComponent
     */
    @Autowired
    public FeedbackClassService(UserRoleComponent userRoleComponent) {
        this.userRoleComponent = userRoleComponent;
    }


    /**
     * I recieve the feedback.
     */
    @RequestMapping(value = "{feedback}", method = RequestMethod.GET)
    @RequiresPermission(UserPermission.CAN_READ_STAMMDATEN)
    public void sendFeedback(@PathVariable("feedback") final String feedback) {
        LOGGER.debug("Receive 'feedback' request with '{}'", feedback);
        this.userRoleComponent.sendFeedback(feedback);
    }

}

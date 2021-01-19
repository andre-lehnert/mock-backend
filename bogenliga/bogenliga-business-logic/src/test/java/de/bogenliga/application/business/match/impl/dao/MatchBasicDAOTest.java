package de.bogenliga.application.business.match.impl.dao;

import java.lang.reflect.InvocationTargetException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import de.bogenliga.application.business.baseClass.impl.BasicTest;
import de.bogenliga.application.business.match.impl.BaseMatchTest;
import de.bogenliga.application.business.match.impl.entity.MatchBE;
import de.bogenliga.application.common.component.dao.BasicDAO;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

/**
 * TODO [AL] class documentation
 *
 * @author Kay Scheerer
 */
public class MatchBasicDAOTest extends BaseMatchTest {


    @InjectMocks
    private MatchDAO underTest;


    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();
    @Mock
    private BasicDAO basicDao;

    private MatchBE expectedBE;

    private static final long USER = 0;

    // Implements generic way to test business entities methods
    private BasicTest<MatchBE, MatchBE> basicDAOTest;


    @Before
    public void testSetup() {
        expectedBE = getMatchBE();
        basicDAOTest = new BasicTest<>(expectedBE, getValuesToMethodMap());
        basicDAOTest.setEntity(expectedBE);

    }


    @Test
    public void create() {
        when(basicDao.insertEntity(any(), any())).thenReturn(expectedBE);
        try {
            basicDAOTest.testAllFieldsOnEqualToExpectedEntity(underTest.create(expectedBE, USER));
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        // verify invocations
        verify(basicDao).insertEntity(any(), eq(expectedBE));
    }


    @Test
    public void update() {
        when(basicDao.updateEntity(any(), any(), any())).thenReturn(expectedBE);
        try {
            basicDAOTest.testAllFieldsOnEqualToExpectedEntity(underTest.update(expectedBE, USER));
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        verify(basicDao).updateEntity(any(), eq(expectedBE), any());
    }


    @Test
    public void delete() {
        underTest.delete(expectedBE, USER);
        // verify invocations
        verify(basicDao).deleteEntity(any(), eq(expectedBE), any());
    }
}

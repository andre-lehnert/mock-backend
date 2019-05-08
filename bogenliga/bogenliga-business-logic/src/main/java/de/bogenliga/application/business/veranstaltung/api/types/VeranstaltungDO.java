package de.bogenliga.application.business.veranstaltung.api.types;

/**
 * TODO [AL] class documentation
 *
 * @author Daniel Schott, daniel.schott@student.reutlingen-university.de
 */

import de.bogenliga.application.common.component.types.CommonDataObject;
import de.bogenliga.application.common.component.types.DataObject;
import java.util.Objects;

import java.sql.Date;
import java.time.OffsetDateTime;

public class VeranstaltungDO extends CommonDataObject implements DataObject {

    private Long veranstaltungID;
    private Long veranstaltungWettkampftypID;
    private String veranstaltungName;
    private Long veranstaltungSportJahr;
    private Date veranstaltungMeldeDeadline;
    private Long veranstaltungLigaleiterID;
    private Long veranstaltungLigaID;
    private String veranstaltungLigaleiterEmail;
    private String veranstaltungWettkampftypName;
    private String veranstaltungLigaName;


    /**
     * Constructor with all parameters
     *
     * @param id
     * @param wettkampfTypID
     * @param name
     * @param sportJahr
     * @param meldeDeadline
     * @param ligaleiterID
     * @param createdAtUtc
     * @param createdByUserId
     * @param lastModifiedAtUtc
     * @param lastModifiedByUserId
     * @param version
     */
    public VeranstaltungDO(final Long id, final Long wettkampfTypID, final String name, final Long sportJahr,
                           final Date meldeDeadline,
                           final Long ligaleiterID, final Long ligaID,
                           final OffsetDateTime createdAtUtc, final Long createdByUserId,
                           final OffsetDateTime lastModifiedAtUtc,
                           final Long lastModifiedByUserId, final Long version,
                           final String ligaleiterEmail,
                           final String wettkampftypName,
                           final String ligaName) {

        this.veranstaltungID = id;
        this.veranstaltungWettkampftypID = wettkampfTypID;
        this.veranstaltungName = name;
        this.veranstaltungSportJahr = sportJahr;
        this.veranstaltungMeldeDeadline = meldeDeadline;
        this.veranstaltungLigaleiterID = ligaleiterID;
        this.veranstaltungLigaID = ligaID;
        this.createdByUserId = createdByUserId;
        this.createdAtUtc = createdAtUtc;
        this.lastModifiedAtUtc = lastModifiedAtUtc;
        this.lastModifiedByUserId = lastModifiedByUserId;
        this.version = version;
        this.veranstaltungLigaleiterEmail = ligaleiterEmail;
        this.veranstaltungWettkampftypName = wettkampftypName;
        this.veranstaltungLigaName = ligaName;
    }


    /**
     * Constructor without technical parameters
     *
     * @param id
     * @param wettkampfTypID
     * @param name
     * @param sportJahr
     * @param meldeDeadline
     * @param ligaleiterID
     */
    public VeranstaltungDO(final Long id, final Long wettkampfTypID, final String name, final Long sportJahr,
                           final Date meldeDeadline, final Long ligaleiterID, final Long ligaID, final String ligaleiterEmail, final String wettkampftypName, final String ligaName) {

        this.veranstaltungID = id;
        this.veranstaltungWettkampftypID = wettkampfTypID;
        this.veranstaltungName = name;
        this.veranstaltungSportJahr = sportJahr;
        this.veranstaltungMeldeDeadline = meldeDeadline;
        this.veranstaltungLigaleiterID = ligaleiterID;
        this.veranstaltungLigaID = ligaID;
        this.veranstaltungLigaleiterEmail = ligaleiterEmail;
        this.veranstaltungWettkampftypName = wettkampftypName;
        this.veranstaltungLigaName = ligaName;

    }


    @Override
    public int hashCode() {
        return Objects.hash(veranstaltungID, veranstaltungWettkampftypID, veranstaltungName, veranstaltungSportJahr,
                veranstaltungMeldeDeadline,
                veranstaltungLigaleiterID, veranstaltungLigaID, veranstaltungLigaleiterEmail, veranstaltungWettkampftypName,
                createdByUserId, lastModifiedAtUtc,
                lastModifiedByUserId, version);
    }


    @Override
    public boolean equals(final Object o) {
        if (o instanceof VeranstaltungDO) {
            final VeranstaltungDO that = (VeranstaltungDO) o;
            return (this.getVeranstaltungID() == that.getVeranstaltungID() &&
                    this.getVeranstaltungWettkampftypID() == that.getVeranstaltungWettkampftypID() &&
                    this.getVeranstaltungName() == that.getVeranstaltungName() &&
                    this.getVeranstaltungSportJahr().equals(that.getVeranstaltungSportJahr()) &&
                    this.getVeranstaltungMeldeDeadline() == that.getVeranstaltungMeldeDeadline() &&
                    this.getVeranstaltungLigaleiterID() == that.getVeranstaltungLigaleiterID() &&
                    this.getVeranstaltungLigaID() == that.getVeranstaltungLigaID() &&
                    this.getVeranstaltungLigaleiterEmail() == that.getVeranstaltungLigaleiterEmail() &&
                    this.getVeranstaltungWettkampftypName() == that.getVeranstaltungWettkampftypName() &&
                    this.getVeranstaltungLigaName() == that.getVeranstaltungLigaName());
        }
        return false;

    }


    //autogenerated getter and setters for all attributes
    public Long getVeranstaltungID() {
        return veranstaltungID;
    }


    public void setVeranstaltungID(Long veranstaltungID) {
        this.veranstaltungID = veranstaltungID;
    }


    public Long getVeranstaltungWettkampftypID() {
        return veranstaltungWettkampftypID;
    }


    public void setVeranstaltungWettkampftypID(Long veranstaltungWettkampftypID) {
        this.veranstaltungWettkampftypID = veranstaltungWettkampftypID;
    }


    public String getVeranstaltungName() {
        return veranstaltungName;
    }


    public void setVeranstaltungName(String veranstaltungName) {
        this.veranstaltungName = veranstaltungName;
    }


    public Long getVeranstaltungSportJahr() {
        return veranstaltungSportJahr;
    }


    public void setVeranstaltungSportJahr(Long veranstaltungSportJahr) {
        this.veranstaltungSportJahr = veranstaltungSportJahr;
    }


    public Date getVeranstaltungMeldeDeadline() {
        return veranstaltungMeldeDeadline;
    }


    public void setVeranstaltungMeldeDeadline(Date veranstaltungMeldeDeadline) {
        this.veranstaltungMeldeDeadline = veranstaltungMeldeDeadline;
    }


    public Long getVeranstaltungLigaleiterID() {
        return veranstaltungLigaleiterID;
    }


    public void setVeranstaltungLigaleiterID(Long veranstaltungLigaleiterID) {
        this.veranstaltungLigaleiterID = veranstaltungLigaleiterID;
    }


    public OffsetDateTime getCreatedAtUtc() {
        return createdAtUtc;
    }


    public void setCreatedAtUtc(OffsetDateTime createdAtUtc) {
        this.createdAtUtc = createdAtUtc;
    }


    public Long getCreatedByUserId() {
        return createdByUserId;
    }


    public void setCreatedByUserId(Long createdByUserId) {
        this.createdByUserId = createdByUserId;
    }


    public OffsetDateTime getLastModifiedAtUtc() {
        return lastModifiedAtUtc;
    }


    public void setLastModifiedAtUtc(OffsetDateTime lastModifiedAtUtc) {
        this.lastModifiedAtUtc = lastModifiedAtUtc;
    }


    public Long getVersion() {
        return version;
    }


    public void setVersion(Long version) {
        this.version = version;
    }


    public String getVeranstaltungLigaleiterEmail() {
        return veranstaltungLigaleiterEmail;
    }


    public void setVeranstaltungLigaleiterEmail(String veranstaltungligaLeiterEmail) {
        this.veranstaltungLigaleiterEmail = veranstaltungLigaleiterEmail;
    }


    public String getVeranstaltungWettkampftypName() {
        return veranstaltungWettkampftypName;
    }


    public void setVeranstaltungWettkampftypName(String veranstaltungWettkampftypName) {
        this.veranstaltungWettkampftypName = veranstaltungWettkampftypName;
    }


    public Long getVeranstaltungLigaID() {
        return veranstaltungLigaID;
    }


    public void setVeranstaltungLigaID(Long veranstaltungLigaID) {
        this.veranstaltungLigaID = veranstaltungLigaID;
    }


    public String getVeranstaltungLigaName() {
        return veranstaltungLigaName;
    }


    public void setVeranstaltungLigaName(String veranstaltungLigaName) {
        this.veranstaltungLigaName = veranstaltungLigaName;
    }
}

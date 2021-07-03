package de.bogenliga.application.business.schuetzenstatistik.api.types;

import de.bogenliga.application.common.component.types.CommonDataObject;
import de.bogenliga.application.common.component.types.DataObject;

import java.util.Objects;

/**
 * Contains the values of the liga business entity.
 *
 * @author Bruno Michael Cunha Teixeira, Bruno_Michael.Cunha_teixeira@Student.Reutlingen-University.de
 */
public class SchuetzenstatistikDO extends CommonDataObject implements DataObject {

    /**
     * business parameter
     */

    private Long veranstaltungId;
    private String veranstaltungName;
    private Long wettkampfId;
    private int wettkampfTag;
    private Long mannschaftId;
    private int mannschaftNummer;
    private Long vereinId;
    private String vereinName;


    public SchuetzenstatistikDO() {
        // empty constructor
    }


    /**
     * Constructor with optional parameters
     *
     * @param veranstaltungId;
     * @param veranstaltungName;
     * @param wettkampfId;
     * @param wettkampfTag;
     * @param mannschaftId;
     * @param mannschaftNummer;
     * @param vereinId;
     * @param vereinName;

     */
    public SchuetzenstatistikDO(
            final Long veranstaltungId,
            final String veranstaltungName,
            final Long wettkampfId,
            final int wettkampfTag,
            final Long mannschaftId,
            final int mannschaftNummer,
            final Long vereinId,
            final String vereinName
            ) {
        this.veranstaltungId=veranstaltungId;
        this.veranstaltungName = veranstaltungName;
        this.wettkampfId = wettkampfId;
        this.wettkampfTag = wettkampfTag;
        this.mannschaftId = mannschaftId;
        this.mannschaftNummer = mannschaftNummer;
        this.vereinId = vereinId;
        this.vereinName = vereinName;
    }


    public Long getveranstaltungId() { return veranstaltungId; }
    public void setveranstaltungId(Long veranstaltungId) { this.veranstaltungId = veranstaltungId; }

    public String getveranstaltungName() { return veranstaltungName; }
    public void setveranstaltungName(String veranstaltungName) { this.veranstaltungName = veranstaltungName; }

    public Long getwettkampfId() { return wettkampfId; }
    public void setwettkampfId(Long wettkampfId) { this.wettkampfId = wettkampfId; }

    public int getwettkampfTag() { return wettkampfTag; }
    public void setwettkampfTag(int wettkampfTag) { this.wettkampfTag = wettkampfTag; }

    public Long getmannschaftId() { return mannschaftId; }
    public void setmannschaftId(Long mannschaftId) { this.mannschaftId = mannschaftId; }

    public int getmannschaftNummer() { return mannschaftNummer; }
    public void setmannschaftNummer(int mannschaftNummer) { this.mannschaftNummer = mannschaftNummer; }

    public Long getvereinId() { return vereinId; }
    public void setvereinId(Long vereinId) { this.vereinId = vereinId; }

    public String getvereinName() { return vereinName; }
    public void setvereinName(String vereinName) { this.vereinName = vereinName; }


    @Override
    public int hashCode() {
        return Objects.hash(veranstaltungId, veranstaltungName, wettkampfId, wettkampfTag, mannschaftId,
                mannschaftNummer, vereinId, vereinName);
    }

    @Override
    public boolean equals(final Object o){
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final SchuetzenstatistikDO that = (SchuetzenstatistikDO) o;
        return veranstaltungId.equals(that.veranstaltungId) &&
                Objects.equals(veranstaltungName, that.veranstaltungName)&&
                wettkampfId.equals(that.wettkampfId) &&
                wettkampfTag == that.wettkampfTag &&
                mannschaftId.equals(that.mannschaftId) &&
                mannschaftNummer == that.mannschaftNummer &&
                vereinId.equals(that.vereinId) &&
                Objects.equals(vereinName, that.vereinName);
    }

}
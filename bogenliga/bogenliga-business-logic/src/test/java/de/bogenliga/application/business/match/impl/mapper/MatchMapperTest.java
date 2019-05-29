package de.bogenliga.application.business.match.impl.mapper;

import org.junit.Test;
import de.bogenliga.application.business.match.api.types.MatchDO;
import de.bogenliga.application.business.match.impl.BaseMatchTest;
import de.bogenliga.application.business.match.impl.entity.MatchBE;
import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * @author Dominik Halle, HSRT MKI SS19 - SWT2
 */
public class MatchMapperTest extends BaseMatchTest {

    private void validateBES(MatchBE matchBE, MatchBE matchBEMapped) {
        assertThat(matchBE).isNotNull();
        assertThat(matchBE.getId()).isEqualTo(matchBEMapped.getId()).isEqualTo(MATCH_ID);
        assertThat(matchBE.getBegegnung()).isEqualTo(matchBEMapped.getBegegnung()).isEqualTo(MATCH_BEGEGNUNG);
        assertThat(matchBE.getMannschaftId()).isEqualTo(matchBEMapped.getMannschaftId()).isEqualTo(
                MATCH_MANNSCHAFT_ID);
        assertThat(matchBE.getWettkampfId()).isEqualTo(matchBEMapped.getWettkampfId()).isEqualTo(MATCH_WETTKAMPF_ID);
        assertThat(matchBE.getMatchpunkte()).isEqualTo(matchBEMapped.getMatchpunkte()).isEqualTo(MATCH_MATCHPUNKTE);
        assertThat(matchBE.getSatzpunkte()).isEqualTo(matchBEMapped.getSatzpunkte()).isEqualTo(MATCH_SATZPUNKTE);
        assertThat(matchBE.getNr()).isEqualTo(matchBEMapped.getNr()).isEqualTo(MATCH_NR);
    }


    private void validateDO(MatchBE matchBE, MatchDO matchDOMapped) {
        assertThat(matchBE).isNotNull();
        assertThat(matchBE.getId()).isEqualTo(matchDOMapped.getId()).isEqualTo(MATCH_ID);
        assertThat(matchBE.getBegegnung()).isEqualTo(matchDOMapped.getBegegnung()).isEqualTo(MATCH_BEGEGNUNG);
        assertThat(matchBE.getMannschaftId()).isEqualTo(matchDOMapped.getMannschaftId()).isEqualTo(
                MATCH_MANNSCHAFT_ID);
        assertThat(matchBE.getWettkampfId()).isEqualTo(matchDOMapped.getWettkampfId()).isEqualTo(MATCH_WETTKAMPF_ID);
        assertThat(matchBE.getMatchpunkte()).isEqualTo(matchDOMapped.getMatchpunkte()).isEqualTo(MATCH_MATCHPUNKTE);
        assertThat(matchBE.getSatzpunkte()).isEqualTo(matchDOMapped.getSatzpunkte()).isEqualTo(MATCH_SATZPUNKTE);
        assertThat(matchBE.getNr()).isEqualTo(matchDOMapped.getNr()).isEqualTo(MATCH_NR);
    }


    @Test
    public void testMapping() {
        MatchBE matchBE = getMatchBE();
        MatchDO matchDO = MatchMapper.toMatchDO.apply(matchBE);
        this.validateDO(matchBE, matchDO);
        MatchBE matchBEMapped = MatchMapper.toMatchBE.apply(matchDO);
        this.validateBES(matchBE, matchBEMapped);
    }
}
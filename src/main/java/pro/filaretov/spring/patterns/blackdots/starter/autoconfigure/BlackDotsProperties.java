package pro.filaretov.spring.patterns.blackdots.starter.autoconfigure;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 *
 */
@Getter
@Setter
@ToString
@ConfigurationProperties(prefix = "black.dots")
public class BlackDotsProperties {

    public static final String DEFAULT_OCTAVE = "first";

    private String octave = DEFAULT_OCTAVE;

    @NestedConfigurationProperty
    private Instrument instrument = new Instrument();

    @Getter
    @Setter
    @ToString
    public static class Instrument {

        private String type = "Grand Piano";
    }
}



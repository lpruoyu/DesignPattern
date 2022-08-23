package programmer.lp.ds.sgg.builder;

import lombok.Builder;
import lombok.ToString;

//@Accessors(chain = true)
@Builder
@ToString
public class VivoPhone {
    private String cpu;
    private String mem;
    private String cam;
    private String dis;
}

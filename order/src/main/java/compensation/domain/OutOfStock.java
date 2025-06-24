package compensation.domain;

import compensation.domain.*;
import compensation.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OutOfStock extends AbstractEvent {

    private Long id;
    private String stock;
    private String orderid;
}

package one.digitalinnovation.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.enums.PhoneType;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PhoneDTO {

    private long id;

    @Enumerated(EnumType.STRING)
    private PhoneType type;

    @Size(min = 13, max = 14)
    private String number;


}

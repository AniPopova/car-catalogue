package compact.smart.solutions.catalogue.models;

import static compact.smart.solutions.catalogue.utils.MessagesAndConstants.EMPTY_TRANSMISSION;
import static compact.smart.solutions.catalogue.utils.MessagesAndConstants.NAME_TOO_LONG;
import static compact.smart.solutions.catalogue.utils.MessagesAndConstants.NAME_TOO_SHORT;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Transmission
{

  @NotEmpty(message = EMPTY_TRANSMISSION)
  @Size(min = 3, message = NAME_TOO_SHORT)
  @Size(max = 20, message = NAME_TOO_LONG)
  private String name;
}

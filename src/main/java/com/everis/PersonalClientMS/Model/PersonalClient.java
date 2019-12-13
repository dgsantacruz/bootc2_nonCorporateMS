package com.everis.PersonalClientMS.Model;

// import java.util.Date;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

//This lombok annotation it's a shortcut to @string, @EqualsandHashCode, @Getter and @Setter and @RequiredArgsConstructor
@Data
//This spring data annotation allows to override default collection naming to one I choose.
@Document(collection = "PersonalClients")
public class PersonalClient {

    @Id
    private String id;

	@NotBlank
    private String dni;
    
	@NotBlank
    private String firstname;

    @NotBlank
    private String lastname;
    
    @NotBlank
    private String address;

    @NotBlank
    private String phone;  
}
package com.everis.noncorporate.Model;

// import java.util.Date;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
// import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

//This lombok annotation it's a shortcut to @string, @EqualsandHashCode, @Getter and @Setter and @RequiredArgsConstructor
@Data

//This spring data annotation allows to override default collection naming to one I choose.
@Document(collection = "nonCorpClients")
public class NonCorpClient {

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
    
	// @DateTimeFormat(pattern = "yyyy-MM-dd")
	// private Date dateBirth;
	
}
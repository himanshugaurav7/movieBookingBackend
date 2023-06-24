//package com.rbp.movieapp.swagger;
//
//import java.util.Collection;
//import java.util.Collections;
//
//import org.springframework.context.annotation.Bean;
//
//import io.swagger.v3.oas.models.info.Contact;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@EnableSwagger2
//public class SwaggerConfig {
//
//	@Bean
//	public Docket api() {
//		return new Docket(DocumentationType.SWAGGER_2)
//				.apiInfo(getInfo()).select().apis(RequestHandlerSelectors.any()).paths(PathSelectors.any()).build();
//	}
//
//	private ApiInfo getInfo() {
////		return new ApiInfo("MovieBooking App", "This project is developed by Himanshu Gaurav", "1.0", "Terms Of Service",new Contact("Himanshu Gaurav","https://moviebooking.com","himanshugaurav@gmail.com"), "License of APIS", "API License URL",Collections.emptyList());
//		return new ApiInfo("MovieBooking App", "This project is developed by Himanshu Gaurav", "2.0", 
//           "Terms Of Service",new springfox.documentation.service
//           .Contact("Himanshu Gaurav","http://localhost:9093/v3/api-docs","himanshugaurav@gmail.com"), 
//           "License of APIS", "API License URL",Collections.emptyList());
//	}
//}





//working
//package com.rbp.movieapp.swagger;
//
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.ApiKey;
//import springfox.documentation.service.AuthorizationScope;
//import springfox.documentation.service.Contact;
//import springfox.documentation.service.SecurityReference;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spi.service.contexts.SecurityContext;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//
//	public static final String AUTHORIZATION_HEADER="Authorization";
//	
//	private ApiKey apiKey() {
//		return new ApiKey("JWT", AUTHORIZATION_HEADER, "header");
//	}
//	
//	
//	private List<SecurityContext> securityContexts(){
//		return Arrays.asList(SecurityContext.builder().securityReferences(securityReferences()).build());
//	}
//	
//	private List<SecurityReference> securityReferences(){
//		
//		AuthorizationScope scope = new AuthorizationScope("global", "accessEverything");
//		return Arrays.asList(new SecurityReference("JWT", new AuthorizationScope[] {scope}));
//	}
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//        		.apiInfo(getInfo())
//        		.securityContexts(securityContexts())
//        		.securitySchemes(Arrays.asList(apiKey()))
//                .select()
//                .apis(RequestHandlerSelectors.any())
//                .paths(PathSelectors.any())
//                .build() ;
//    }
//
//    private ApiInfo getInfo() {
//        return new ApiInfo(
//                "MovieBooking App",
//                "This project is developed by Himanshu Gaurav",
//                "2.0",
//                "Terms of Service",
//                 new Contact("Himanshu Gaurav","http://localhost:9093/v3/api-docs","himanshugaurav@gmail.com"),
//                "Apache 2.0",
//                "http://www.apache.org/licenses/LICENSE-2.0",
//                Collections.emptyList()
//        );
//    }
//}





//working
package com.rbp.movieapp.swagger;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.Contact;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    public static final String AUTHORIZATION_HEADER = "Authorization";

    private ApiKey apiKey() {
        return new ApiKey("Authorization", AUTHORIZATION_HEADER, "header");
    }

    private List<SecurityContext> securityContexts() {
        return Arrays.asList(SecurityContext.builder().securityReferences(securityReferences()).build());
    }

    private List<SecurityReference> securityReferences() {
        AuthorizationScope scope = new AuthorizationScope("global", "accessEverything");
        return Arrays.asList(new SecurityReference("Authorization", new AuthorizationScope[] { scope }));
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(getInfo())
                .securityContexts(securityContexts())
                .securitySchemes(Arrays.asList(apiKey()))
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo getInfo() {
        return new ApiInfo(
                "MovieBooking App",
                "This project is developed by Himanshu Gaurav",
                "2.0",
                "Terms of Service",
                new Contact("Himanshu Gaurav", "http://localhost:9093/v3/api-docs", "himanshugaurav@gmail.com"),
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                Collections.emptyList()
        );
    }
}

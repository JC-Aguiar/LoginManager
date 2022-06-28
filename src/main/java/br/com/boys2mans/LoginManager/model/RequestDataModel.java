package br.com.boys2mans.LoginManager.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Entity(name = "RequestData")
public class RequestDataModel {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String ip;

    String system;

    String browser;

    String geoLocalizationX;

    String geoLocalizationY;

    String request;

    @ManyToOne()
    UserModel user;

}

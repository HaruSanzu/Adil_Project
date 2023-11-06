package com.example.adil_prooject.models;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "players")
public class Players {
    @Id
    private long id;
    private String nickname;
    private String name;
    private String surname;
    private String country;
}

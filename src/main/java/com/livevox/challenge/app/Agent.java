package com.livevox.challenge.app;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "agents")
@Data
public class Agent {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "agent_id")
    @SequenceGenerator(name = "agent_id", sequenceName = "agent_id_seq", allocationSize = 1, initialValue = 100)
    private Long id;

    private String firstName;

    private String lastName;

    private String extension;

    private Boolean active;

    private Long callCenterId;
}

package com.haitao.jms.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HelloWorldMessage implements Serializable {

    static final long serialVersionUID = -8833870832690676231L;

    private UUID id;
    private String message;
}

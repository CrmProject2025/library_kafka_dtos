package com.example2.library_kafka_dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MeasurementCreatedEventKafkaDto {
    private long id;

    private long meterId;

    private BigDecimal currentFlowRate;

    private BigDecimal averageDailyConsumption;

    private BigDecimal gasPressure;

    private BigDecimal gasTemperature;

    private boolean valveStatus;

    private String errorCode;

    private LocalDateTime measurementDateTime;

    private LocalDateTime recordingToDbDateTime;

}
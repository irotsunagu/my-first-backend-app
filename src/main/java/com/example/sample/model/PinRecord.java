package com.example.sample.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotNull;

/**
 * ピンの情報を規定する型（Entity、record）
 */
@Document
public record PinRecord(
        @Id @NotNull(message = "id is required") String id,
        @NotNull(message = "title is required") String title,
        @NotNull(message = "description is required") String description,
        @NotNull(message = "latitude is required") double latitude,
        @NotNull(message = "longitude is required") double longitude,
        @NotNull(message = "category is required") String category,
        @NotNull(message = "imageUrl is required") String imageUrl) {
}

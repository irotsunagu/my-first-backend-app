package com.example.sample.model;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotNull;

/**
 * ピンの情報を規定する型（record）
 * 必須チェックを行っているため、値は必ずすべて入っている必要がある
 */
@Document
public record PinRecordModel(
        @NotNull(message = "title is required") String title,
        @NotNull(message = "description is required") String description,
        @NotNull(message = "latitude is required") double latitude,
        @NotNull(message = "longitude is required") double longitude,
        @NotNull(message = "category is required") String category,
        @NotNull(message = "imageUrl is required") String imageUrl) {
}

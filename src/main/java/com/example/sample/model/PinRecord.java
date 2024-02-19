package com.example.sample.model;

import jakarta.validation.constraints.NotNull;

/**
 * ピンの情報を規定する型（Entity、record）
 */
public record PinRecord(
                @NotNull(message = "id is required") String id,
                @NotNull(message = "title is required") String title,
                @NotNull(message = "description is required") String description,
                @NotNull(message = "latitude is required") double latitude,
                @NotNull(message = "longitude is required") double longitude,
                @NotNull(message = "category is required") String category,
                @NotNull(message = "imageUrl is required") String imageUrl) {
}

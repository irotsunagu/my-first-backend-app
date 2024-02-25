package com.example.sample.repository.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * ピンの情報を規定する型（Entity）
 * MongoDBに入れ込むデータ（レスポンスデータ）を規定している
 */
@Document
public record PinRecordEntity(
                @Id String id,
                String title,
                String description,
                double latitude,
                double longitude,
                String category,
                String imageUrl) {
}

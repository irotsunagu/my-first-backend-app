package com.example.sample.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.sample.model.PinRecord;

/**
 * バックエンドAPIのサンプルリポジトリ（MongoRepositoryをそのまま使用）
 */
public interface MongoAccessRepository extends MongoRepository<PinRecord, String> {
}
package com.example.sample.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.sample.model.PinRecord;
import com.example.sample.repository.MongoAccessRepository;

/**
 * バックエンドAPIのサンプルコントローラ
 */
@Service
public class MapService {

    /**
     * リポジトリ層のクラス定義
     */
    private final MongoAccessRepository repository;

    /**
     * コンストラクタ
     * 
     * @param repository
     */
    public MapService(MongoAccessRepository repository) {
        this.repository = repository;
    }

    /**
     * 全格納データを参照する
     * 
     * @return
     */
    public List<PinRecord> findAll() {
        return repository.findAll();
    }

    /**
     * 指定したidのデータを参照する
     * 
     * @param id
     * @return 指定したidのデータ
     */
    public Optional<PinRecord> findById(String id) {
        return repository.findById(id);
    }

    /**
     * 指定したidのデータが存在するか確認する
     * 
     * @param id
     * @return 存在確認結果
     */
    public boolean existsById(String id) {
        return repository.existsById(id);
    }

    /**
     * 指定したデータを格納する
     * 
     * @param pinRecord
     * @return 格納したデータ
     */
    public PinRecord save(PinRecord pinRecord) {
        return repository.save(pinRecord);
    }

    /**
     * 指定したidのデータを削除する
     * 
     * @param id
     */
    public void deleteById(String id) {
        repository.deleteById(id);
    }
}

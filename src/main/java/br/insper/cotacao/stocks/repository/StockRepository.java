package br.insper.cotacao.stocks.repository;

import br.insper.cotacao.stocks.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StockRepository extends JpaRepository<Stock, Integer> {
    Optional<Stock> findByTicker(String ticker);
}

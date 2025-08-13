package br.insper.cotacao.stocks.repository;

import br.insper.cotacao.stocks.model.StockHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepositoryHistory extends JpaRepository<StockHistory, Integer> {
}

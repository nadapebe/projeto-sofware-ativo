package br.insper.cotacao.stocks.dto;

import br.insper.cotacao.stocks.model.Stock;

import java.time.LocalDate;
import java.util.List;

public record StockDTO(
        Integer id,
        String ticker,
        String name,
        Float lastValue,
        LocalDate dateLastValue,
        LocalDate dateRegister,
        List<StockHistoryDTO> stockHistory
) {

    public static StockDTO fromModel(Stock stock) {
        return new StockDTO(
                stock.getId(),
                stock.getTicker(),
                stock.getName(),
                stock.getLastValue(),
                stock.getDateLastValue(),
                stock.getDateRegister(),
                stock.getStockHistory() != null
                        ? stock.getStockHistory().stream().map(StockHistoryDTO::fromModel).toList()
                        : null
        );
    }
}
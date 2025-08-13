package br.insper.cotacao.stocks.dto;

import br.insper.cotacao.stocks.model.StockHistory;

import java.time.LocalDate;

public record StockHistoryDTO(
        Integer id,
        Float value,
        LocalDate dateValue
) {

    public static StockHistoryDTO fromModel(StockHistory history) {
        return new StockHistoryDTO(
                history.getId(),
                history.getStockValue(),
                history.getDateValue()
        );
    }

}
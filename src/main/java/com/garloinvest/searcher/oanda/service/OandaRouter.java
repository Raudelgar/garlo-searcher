package com.garloinvest.searcher.oanda.service;

import com.garloinvest.searcher.oanda.dto.candle.OandaInstrumentCandlestick;
import com.garloinvest.searcher.oanda.dto.price.OandaInstrumentPrice;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public interface OandaRouter {

    public Map<String, Map<LocalDateTime, OandaInstrumentCandlestick>> readOandaInstrumentCandlestickPerMinute(String instrumentName);
    public Map<String, OandaInstrumentPrice> readOandaInstrumentPrice(List<String> instruments);
}
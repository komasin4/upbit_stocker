package komasin4.finance.upbit.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import komasin4.finance.upbit.model.MinuteCandleModel;

@Mapper
public interface CandleMapper {
	public List<MinuteCandleModel> selectMinuteCandles() throws Exception;
	public List<MinuteCandleModel> selectMinuteCandles(String candle_time, int limit) throws Exception;
	public MinuteCandleModel selectMinuteCandle(String candleTime) throws Exception;
	public int insertMinuteCandle(MinuteCandleModel candle) throws Exception;
	public int insertMinuteCandle30(MinuteCandleModel candle) throws Exception;
	public int updateMinuteCandle(MinuteCandleModel candle) throws Exception;
}

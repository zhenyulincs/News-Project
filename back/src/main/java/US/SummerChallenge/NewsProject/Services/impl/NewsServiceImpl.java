package US.SummerChallenge.NewsProject.Services.impl;

import US.SummerChallenge.NewsProject.Services.iNewsService;
import US.SummerChallenge.NewsProject.model.dto.NewsDTO;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

/**
 * @Author: Zhenyu Lin
 * @Date: 2021/6/29 1:05
 **/
@Service
public class NewsServiceImpl implements iNewsService {
    @Override
    public NewsDTO getNews() {
        return null;
    }

    @Override
    public NewsDTO getNews(LocalDate date) {
        return null;
    }
}

package edu.icet.ecom.service;

import edu.icet.ecom.dto.NamesDto;

public interface FakeBusinessNameService {
    NamesDto getInformation(NamesDto namesDto);
    Integer calculateStatus(Integer following, Integer likes);
    void getCountOfPosts(Integer posts);
    int checkEngagementRisk(double engagement);
}

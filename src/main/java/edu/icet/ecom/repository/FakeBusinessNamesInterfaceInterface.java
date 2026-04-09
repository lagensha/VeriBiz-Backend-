package edu.icet.ecom.repository;

import edu.icet.ecom.dto.NamesDto;

public interface FakeBusinessNamesInterfaceInterface {
    NamesDto getInformation();
    Integer calculateStatus(Integer following, Integer likes);
    void getCountOfPosts(Integer posts);
     int checkEngagementRisk(double engagement);
}

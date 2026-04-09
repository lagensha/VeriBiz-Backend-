package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.NamesDto;
import edu.icet.ecom.service.FakeBusinessNameService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class FakeBusinessNamesServiceImpl implements FakeBusinessNameService {
    @Override
    public NamesDto getInformation(NamesDto namesDto) {
        namesDto.setUserName(namesDto.getUserName());
       namesDto.setFollowingCount( namesDto.getFollowingCount());
       namesDto.setFollowingCount( namesDto.getLikes());
        return namesDto;
    }

    @Override
    public Integer calculateStatus(Integer following, Integer likes) {
        return 0;
    }

    @Override
    public void getCountOfPosts(Integer posts) {

    }

    @Override
    public int checkEngagementRisk(double engagement) {
        return 0;
    }
}

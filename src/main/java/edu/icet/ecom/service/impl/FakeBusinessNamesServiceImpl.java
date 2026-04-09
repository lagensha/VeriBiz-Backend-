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
        namesDto.setFollowingCount(namesDto.getFollowingCount());
        namesDto.setLikes(namesDto.getLikes());
        namesDto.setFollowersCount(namesDto.getFollowersCount());
        return namesDto;
    }

    @Override
    public boolean calculateStatus(String following, String likes, String followers) {
        return false;
    }

    @Override
    public void getCountOfPosts(Integer posts) {

    }


}

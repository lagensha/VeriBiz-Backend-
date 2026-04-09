package edu.icet.ecom.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class NamesDto {
    private String userName;
    private int followingCount;
    private int likes;
    private int followersCount;
}

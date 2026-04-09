package edu.icet.ecom.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class NamesDto {
    private String userName;
    private String followingCount;
    private String likes;
    private boolean isAccountFake;
    private double engagement;
}

package com.sokha.reportappbff;

import lombok.Builder;

@Builder
public record UserProfile(
        String username,
        String email,
        String familyName,
        String givenName
) {
}

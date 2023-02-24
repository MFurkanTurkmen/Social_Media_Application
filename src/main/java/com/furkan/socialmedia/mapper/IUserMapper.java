package com.furkan.socialmedia.mapper;

import com.furkan.socialmedia.dto.request.UserRegisterRequest;
import com.furkan.socialmedia.dto.request.UserUpdateRequest;
import com.furkan.socialmedia.dto.response.FindPostResponse;
import com.furkan.socialmedia.dto.response.UserProfileResponse;
import com.furkan.socialmedia.repository.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IUserMapper {
    IUserMapper INSTANCE = Mappers.getMapper(IUserMapper.class);

    User toUser(final UserRegisterRequest dto);

    User toUser(final UserUpdateRequest dto);

    UserProfileResponse toDto(final User user);
}

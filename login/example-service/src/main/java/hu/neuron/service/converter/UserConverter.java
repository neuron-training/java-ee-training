package hu.neuron.service.converter;

import java.util.List;

import hu.neuron.core.dao.RoleDao;
import hu.neuron.core.dao.impl.RoleDaoImpl;
import hu.neuron.core.dto.RoleDto;
import hu.neuron.core.dto.UserDto;
import hu.neuron.service.vo.UserVo;

public class UserConverter {

	public static UserVo toUserVo(UserDto dto) {
		if (dto == null) {
			return null;
		}
		UserVo userVo = new UserVo();
		userVo.setUsername(dto.getUsername());
		userVo.setPassword(dto.getPassword());
		userVo.setUrl(dto.getUrl());
		userVo.setFirstname(dto.getFirstname());
		userVo.setLastname(dto.getLastname());
		userVo.setEmail(dto.getEmail());
		userVo.setPhone(dto.getPhone());
		userVo.setId(dto.getId());

		// RoleDao roleDao = new RoleDaoImpl();

		// List<RoleDto> roles = roleDao.findRolesByUser(dto.getId());
		// userVo.setRoles(roles);
		return userVo;
	}

	public static UserDto toUserDto(UserVo vo) {
		UserDto userDto = new UserDto();
		userDto.setId(vo.getId());
		userDto.setPassword(vo.getPassword());
		userDto.setUsername(vo.getUsername());
		userDto.setUrl(vo.getUrl());
		userDto.setFirstname(vo.getFirstname());
		userDto.setLastname(vo.getLastname());
		userDto.setEmail(vo.getEmail());
		userDto.setPhone(vo.getPhone());
		return userDto;
	}
}

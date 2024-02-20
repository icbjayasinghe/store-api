package com.skyhigh.storeapi.util.convertor;

import org.springframework.core.convert.converter.Converter;
import com.skyhigh.storeapi.model.Address;
import com.skyhigh.storeapi.model.dto.AddressDto;
import org.springframework.stereotype.Service;

@Service
public class AddressToAddressDto implements Converter<Address, AddressDto> {
    @Override
    public AddressDto convert(Address address) {
        AddressDto addressDto = AddressDto.builder()
                .addressId(address.getAddressId())
                .addresLine1(address.getAddresLine1())
                .addresLine2(address.getAddresLine2())
                .city(address.getCity())
                .state(address.getState())
                .country(address.getCountry())
                .zip(address.getZip())
                .build();
        return addressDto;
    }
}

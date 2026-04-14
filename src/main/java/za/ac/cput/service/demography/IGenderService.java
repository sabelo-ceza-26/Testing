package za.ac.cput.service.demography;

import za.ac.cput.domain.demography.Gender;

public interface IGenderService {

    //we don't always extends, we can just put the methods we need

    Gender create(Gender gender);

}

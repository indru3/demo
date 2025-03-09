package recozilla.service;



import com.mysticarts.recozilla.dto.RecozillaDto;

import java.util.List;

public interface RecozillaService {
    boolean validateTheAccount(RecozillaDto recozillaDto);
    RecozillaDto validateUserDetailsByName(String firstName);
    RecozillaDto validateTheAccountDetailsById(int id);
    List<RecozillaDto>getAllAccounts();
    boolean deleteUserById(int id);
    boolean updateAccountDetails(RecozillaDto recozillaDto);


}

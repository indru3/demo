package recozilla.dao;



import recozilla.dto.RecozillaDto;

import java.util.List;

public interface RecozillaDao {

    boolean addAccount(RecozillaDto recozillaDto);
    List<RecozillaDto>getAllAccounts();
    RecozillaDto getAccountById(int id);
    RecozillaDto getAccountsByName(String firstName);
    boolean deleteUserById(int id);
    boolean updateAccountDetails(RecozillaDto recozillaDto);

}

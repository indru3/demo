package recozilla.service;



import com.mysticarts.recozilla.dao.RecozillaDao;
import com.mysticarts.recozilla.dao.RecozillaDaoImpl;
import com.mysticarts.recozilla.dto.RecozillaDto;

import java.util.List;

public class RecozillaServiceImpl implements RecozillaService,Cloneable{
    RecozillaDao recozillaDao = new RecozillaDaoImpl();
    @Override
    public boolean validateTheAccount(RecozillaDto recozillaDto) {
        boolean isVlidated = false;
        boolean isVerified = false;
        if (recozillaDto != null){
            if (recozillaDto.getFirstName() != null && !recozillaDto.getFirstName().isEmpty());
            System.out.println("User Name is Validated");
            isVlidated = true;
        }
        if (recozillaDto.getPhoneNum() != 0 ) {
            System.out.println("Phone num is verified ");
            isVerified = true;
        }
        if (isVerified && isVlidated) {
                System.out.println("User Account is registered");
                recozillaDao.addAccount(recozillaDto);
            }
        return true;
    }

    @Override
    public RecozillaDto validateUserDetailsByName(String firstName) {
        if (firstName != null && !firstName.isEmpty()){
            recozillaDao.getAccountsByName(firstName);
        }
        return recozillaDao.getAccountsByName(firstName);
    }

    @Override
    public RecozillaDto validateTheAccountDetailsById(int id) {
        if (id > 0 ){
            recozillaDao.getAccountById(id);
        }
        return recozillaDao.getAccountById(id);
    }

    @Override
    public List<RecozillaDto> getAllAccounts() {
        return recozillaDao.getAllAccounts();
    }

    @Override
    public boolean deleteUserById(int id) {
        if (id > 0){
            recozillaDao.deleteUserById(id);
        }
        return recozillaDao.deleteUserById(id);
    }

    @Override
    public boolean updateAccountDetails(RecozillaDto recozillaDto) {
        if (recozillaDto.getFirstName() != null && !recozillaDto.getFirstName().isEmpty());
        return recozillaDao.updateAccountDetails(recozillaDto);

    }
}

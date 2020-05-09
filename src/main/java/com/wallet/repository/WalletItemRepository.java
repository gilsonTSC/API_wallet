package com.wallet.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import com.wallet.entity.WalletItem;
import com.wallet.util.enums.TypeEnum;

public interface WalletItemRepository extends JpaRepository<WalletItem, Long> {

	Page<WalletItem> findAllByWalletIdAndDateGreaterThanEqualAndDateLessThanEqual(Long savedWalletId, Date date,
			Date currentDatePlusFiveDays, PageRequest pg);

	List<WalletItem> findByWalletIdAndType(Long savedWalletId, TypeEnum type);

}
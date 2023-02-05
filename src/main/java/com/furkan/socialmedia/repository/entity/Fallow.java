package com.furkan.socialmedia.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Fallow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    //takip eden kişi
    // user id nin takip ettiği fallowidleri
    // beni takip edenler
    private long userid;
    // takip edilen kişi
    private long fallowid;

    /**
     * eğer bir kişi birini takip etmiyor ise
     * bu değer ya hiç yoktur yada 0 dır
     * 0->takip etmiyor
     * 1->takip ediyor
     * 2-> takip isteği göndermiş onay bekliyor
     */
    int status;
}

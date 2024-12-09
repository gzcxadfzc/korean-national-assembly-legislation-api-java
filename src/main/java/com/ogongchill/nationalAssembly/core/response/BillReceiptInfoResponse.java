package com.ogongchill.nationalAssembly.core.response;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.ogongchill.nationalAssembly.core.response.common.BillReceiptInfoHeader;
import com.ogongchill.nationalAssembly.core.response.common.SingleItemBody;
import com.ogongchill.nationalAssembly.core.response.item.billReceipt.BillReceiptInfoItem;

public class BillReceiptInfoResponse {
    @JacksonXmlProperty(localName = "header")
    private BillReceiptInfoHeader header;

    @JacksonXmlProperty(localName = "body")
    private SingleItemBody<BillReceiptInfoItem> body;

    public BillReceiptInfoHeader getHeader() {
        return header;
    }

    public SingleItemBody<BillReceiptInfoItem> getBody() {
        return body;
    }
}

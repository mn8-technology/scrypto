package scorex.crypto.hash

import scorex.crypto._

class HamsiSpecification extends HashTest {

  hashCheck(Hamsi256,
    Map(
      emptyBytes -> "750E9EC469F4DB626BEE7E0C10DDAA1BD01FE194B94EFBABEBD24764DC2B13E9",
      hex2bytes("cc") -> "AC2DAC2A6DDAF703B7A55745D61B1A16A3D1BF1F74CAAB265A2E5DBEBCF60832"
    )
  )

  hashCheck(Hamsi512,
    Map(
      emptyBytes -> "5CD7436A91E27FC809D7015C3407540633DAB391127113CE6BA360F0C1E35F404510834A551610D6E871E75651EA381A8BA628AF1DCF2B2BE13AF2EB6247290F",
      hex2bytes("cc") -> "7DA1BE62A813A8E24D200671CFFB1D0BE79D2BC176FF0B163B11EDED2414EF66261FF52C745383442BC7F1884D5166F26F41D335FC2D2FDB2F93B24B8D079265"
    )
  )

}

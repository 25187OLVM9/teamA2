abstract class MijnAbstract
{
  String str = "N";
  MijnAbstract()
  {
    this("O");
    str += "L";
  }
  MijnAbstract(String str)
  {
    this.str += str;
  }
}
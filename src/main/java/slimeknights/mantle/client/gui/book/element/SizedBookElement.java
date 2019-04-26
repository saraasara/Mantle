package slimeknights.mantle.client.gui.book.element;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public abstract class SizedBookElement extends BookElement {

  public int width, height;

  public SizedBookElement(int x, int y, int width, int height) {
    super(x, y);

    this.width = width;
    this.height = height;
  }

  public boolean isHovered(double mouseX, double mouseY) {
    return mouseX > x && mouseY > y && mouseX < x + width && mouseY < y + height;
  }
}

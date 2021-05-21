import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaProductoAdmin extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%;   border: 2.5px solid white;
  border-radius: 25px;" id="vistaProductoAdmin">
 <vaadin-vertical-layout style="width: 100%;">
  <vaadin-horizontal-layout>
   <label style="margin: var(--lumo-space-m);">Producto: </label>
   <vaadin-text-field id="textNombreProducto" style="margin: var(--lumo-space-m);" readonly></vaadin-text-field>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%;">
  <vaadin-horizontal-layout style="width: 100%;">
   <vaadin-horizontal-layout style="width: 25%;">
    <img id="textImagen" style="width: 80%; height: 80%;">
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 75%;">
    <vaadin-vertical-layout style="width: 100%;">
     <vaadin-vertical-layout>
      <label>DESCRIPCIÓN </label>
     </vaadin-vertical-layout>
     <vaadin-vertical-layout style="width: 100%;">
      <vaadin-text-area id="textDescripcion" style="width: 100%;" readonly></vaadin-text-area>
     </vaadin-vertical-layout>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="align-self: center;">
  <vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="margin: var(--lumo-space-m);">
    <vaadin-button id="buttonVerCaracteristicasDelProducto" style="margin: var(--lumo-space-m);" theme="primary">
     Ver Caracteristicas del producto
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="margin: var(--lumo-space-m);">
    <label style="margin: var(--lumo-space-m);">Precio</label>
    <vaadin-text-field id="textPrecio" style="margin: var(--lumo-space-m);" readonly></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-producto-admin';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductoAdmin.is, VistaProductoAdmin);

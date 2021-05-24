import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaOferta extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;border: #ccc solid 2px; border-radius : 5px;">
 <vaadin-vertical-layout style="width: 20%; height: 100%; padding: var(--lumo-space-m);">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
   <img id="imagen" style="width: 100%; height: 100%;">
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%;">
  <vaadin-vertical-layout theme="spacing" style="height: 100%; width: 100%;">
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 20%; margin-left: var(--lumo-space-xl);">
    <vaadin-horizontal-layout style="width: 100%; height: 100%; justify-content: flex-start;">
     <p style="width: 30%; height: 100%;">Nombre del producto : </p>
     <vaadin-text-field id="nombreText" style="align-self: center;" readonly></vaadin-text-field>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
     <p>Fecha limite : </p>
     <vaadin-text-field id="fechaLimiteText" style="align-self: center;" readonly></vaadin-text-field>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 20%; margin-left: var(--lumo-space-xl);">
    <p>Precio anterior : </p>
    <vaadin-text-field id="precioAnteriorText" style="align-self: center;" readonly></vaadin-text-field>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing-s" style="width: 100%; height: 20%; margin-left: var(--lumo-space-xl);">
    <p>Nuevo precio :</p>
    <vaadin-text-field id="PrecioNuevoText" style="align-self: center;" readonly></vaadin-text-field>
    <vaadin-horizontal-layout theme="spacing" style="justify-content: space-between; height: 100%; width: 50%;">
     <vaadin-button theme="primary" id="verCaracteristicasButton" style="align-self: center;">
      Ver carácteristicas del producto
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-oferta';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaOferta.is, VistaOferta);

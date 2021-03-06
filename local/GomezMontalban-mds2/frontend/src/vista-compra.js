import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaCompra extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 70%; align-items: center; border: #ccc solid 2px; border-radius : 20px; justify-content: center;" id="layoutCompra">
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; flex-shrink: 0; justify-content: center; align-items: center; margin-top: var(--lumo-space-m);">
  <vaadin-horizontal-layout theme="spacing" style="align-self: center; flex-shrink: 0;">
   <label style="align-self: center; flex-shrink: 0;">Número del pedido</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; flex-shrink: 0; align-self: center;">
   <vaadin-text-field style="align-self: center; flex-shrink: 0;" id="textNumeroPedido" readonly></vaadin-text-field>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="align-items: center; justify-content: center; margin-top: var(--lumo-space-l); align-self: center;">
  <vaadin-horizontal-layout theme="spacing" style="align-items: center; justify-content: center; margin-bottom: var(--lumo-space-xs);">
   <vaadin-horizontal-layout theme="spacing" style="justify-content: center; align-items: center;">
    <label>Nombre del cliente</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="align-items: center; justify-content: center;">
    <vaadin-text-field id="textNombreCliente" readonly></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="flex-shrink: 0; margin-top: var(--lumo-space-s); align-self: center;">
  <vaadin-horizontal-layout theme="spacing" style="align-items: center; margin-right: var(--lumo-space-m); margin-left: var(--lumo-space-m); flex-shrink: 1; justify-content: center;">
   <vaadin-horizontal-layout theme="spacing" style="margin-top: var(--lumo-space-xs); margin-bottom: var(--lumo-space-m); margin-left: var(--lumo-space-m); padding-top: var(--lumo-space-m); padding-right: var(--lumo-space-m); padding-bottom: var(--lumo-space-m); padding-left: var(--lumo-space-m); margin-right: var(--lumo-space-xs); flex-shrink: 0;">
    <label style="margin-right: var(--lumo-space-xl); flex-grow: 0; flex-shrink: 0; #label.; padding-right: var(--lumo-space-s);">País </label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="margin-top: var(--lumo-space-xs); margin-right: var(--lumo-space-m); margin-bottom: var(--lumo-space-m); margin-left: var(--lumo-space-m);">
    <vaadin-text-field id="vaadinTextField" dir="textDireccion" readonly></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; align-self: center;">
  <vaadin-horizontal-layout style="flex-shrink: 0; margin-left: var(--lumo-space-xl);">
   <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; margin-right: var(--lumo-space-xl);">
    <label style="align-self: center; flex-shrink: 0; margin-right: var(--lumo-space-m);">Localidad</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="align-self: center; flex-shrink: 0; padding-right: var(--lumo-space-xl);">
    <vaadin-text-field style="margin-left: var(--lumo-space-xl);" id="textLocalidad" readonly></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="margin-bottom: var(--lumo-space-m); align-self: center;">
  <vaadin-horizontal-layout theme="spacing" style="margin-left: var(--lumo-space-l); margin-top: var(--lumo-space-xl);">
   <vaadin-horizontal-layout theme="spacing" style="margin-left: var(--lumo-space-xl);">
    <label style="align-self: center; flex-shrink: 0; margin-right: var(--lumo-space-xl);">Calle </label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="margin-left: var(--lumo-space-xl); padding-left: var(--lumo-space-l);">
    <vaadin-text-field style="margin-right: var(--lumo-space-xl);" id="textCalle" readonly></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="margin-top: var(--lumo-space-s); align-items: center;">
  <vaadin-horizontal-layout theme="spacing" style="align-self: center; flex-shrink: 0; margin-left: var(--lumo-space-s);">
   <vaadin-horizontal-layout theme="spacing" style="margin-right: var(--lumo-space-xl); padding-left: var(--lumo-space-xl); padding-right: var(--lumo-space-l);">
    <label style="align-self: center; flex-shrink: 0; margin-right: var(--lumo-space-l);">Portal </label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="padding-right: var(--lumo-space-m);">
    <vaadin-text-field style="align-self: center; flex-shrink: 0; margin-left: var(--lumo-space-s); margin-right: var(--lumo-space-l);" id="textPortal" readonly></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="margin-top: var(--lumo-space-l); align-items: center;">
  <vaadin-horizontal-layout theme="spacing">
   <vaadin-horizontal-layout theme="spacing" style="margin-right: var(--lumo-space-xl);">
    <label style="align-self: center; flex-shrink: 0; margin-right: var(--lumo-space-m);">Provincia </label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-text-field style="align-self: center; flex-shrink: 0; padding-left: var(--lumo-space-s);" id="textProvincia" readonly></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="margin-top: var(--lumo-space-l); align-self: center;">
  <vaadin-horizontal-layout theme="spacing">
   <vaadin-horizontal-layout theme="spacing" style="margin-right: var(--lumo-space-xl);">
    <label style="align-self: center; flex-shrink: 0;">Código postal</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="padding-right: var(--lumo-space-m);">
    <vaadin-text-field id="textCodigoPostal" readonly></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="margin-top: var(--lumo-space-xl); margin-left: var(--lumo-space-xl); margin-bottom: var(--lumo-space-l); align-self: center;">
  <vaadin-button style="align-self: center; margin-right: var(--lumo-space-m);" id="buttonEnviado" theme="primary">
    Enviar Compra 
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-compra';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCompra.is, VistaCompra);

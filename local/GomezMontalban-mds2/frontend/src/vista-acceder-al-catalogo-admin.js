import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-acceder-al-catalogo-admin`
 *
 * VistaAccederAlCatalogoAdmin element.
 *
 * @customElement
 * @polymer
 */
class VistaAccederAlCatalogoAdmin extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-acceder-al-catalogo-admin';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAccederAlCatalogoAdmin.is, VistaAccederAlCatalogoAdmin);

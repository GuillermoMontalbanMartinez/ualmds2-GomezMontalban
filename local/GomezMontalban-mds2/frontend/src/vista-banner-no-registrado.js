import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-banner-no-registrado`
 *
 * VistaBannerNoRegistrado element.
 *
 * @customElement
 * @polymer
 */
class VistaBannerNoRegistrado extends PolymerElement {

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
        return 'vista-banner-no-registrado';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaBannerNoRegistrado.is, VistaBannerNoRegistrado);
